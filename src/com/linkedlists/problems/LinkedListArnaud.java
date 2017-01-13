package com.linkedlists.problems;



public class LinkedListArnaud<T> implements LinkedList<T> {
	private T data;

	private LinkedListArnaud<T> next;

	private int size = 0;

	public LinkedListArnaud() {
		data = null;
		next = null;
	}

	public LinkedListArnaud(T data) {
		this.data = data;
		size = 1;
		next = null;
	}

	public void addFirst(T data) {
		if (this.data == null && next == null) {
			this.data = data;
			size = 1;
		} else {
			LinkedListArnaud<T> newNext = new LinkedListArnaud<T>(this.data);
			newNext.setNext(next);
			setNext(newNext);
			this.data = data;
		}
	}

	private void setNext(LinkedListArnaud<T> next) {
		this.next = next;
		updateSize();
	}

	private void updateSize() {
		if (this.next != null) {
			size = this.next.size + 1;
		} else {
			size = 1;
		}
	}

	public void addLast(T data) {
		if (this.data == null && next == null) {
			this.data = data;
			size = 1;
		} else if (next == null) {
			setNext(new LinkedListArnaud<T>(data));
		} else {
			next.addLast(data);
			updateSize();
		}
	}

	public void addAfter(T data, int i) {
		if (this.data == null && next == null) {
			throw new IndexOutOfBoundsException();
		}

		if (i == 0) {
			addAfterFirst(data);
		} else if (i > 0) {
			if (next == null) {
				throw new IndexOutOfBoundsException();
			}
			next.addAfter(data, i - 1);
			updateSize();
		} else {
			addFirst(data);
		}
	}

	private void addAfterFirst(T data) {
		LinkedListArnaud<T> newNext = new LinkedListArnaud<T>(data);

		newNext.setNext(next);
		setNext(newNext);
	}

	public T get(int i) {
		if (this.data == null && next == null) {
			throw new IndexOutOfBoundsException();
		}

		int cpt = 0;
		LinkedListArnaud<T> current = this;
		while (cpt < i && current.next != null) {
			current = current.next;
			cpt++;
		}

		if (cpt != i) {
			throw new IndexOutOfBoundsException();
		} else {
			return current.data;
		}
	}

	public int getSize() {
		if (data == null && next == null) {
			return 0;
		}

		return size;
	}

	public void deleteFirst() {
		if (this.data == null && next == null) {
			return;
		} else {
			if (next != null) {
				this.data = next.data;
				setNext(next.next);
			} else {
				this.data = null;
				size = 0;
			}
		}
	}

	public void deleteLast() {
		if (this.data == null && next == null) {
			return;
		} else {
			if (next != null) {
				if (next.next == null) {
					setNext(null);
				} else {
					next.deleteLast();
					updateSize();
				}
			} else {
				this.data = null;
				size = 0;
			}
		}
	}

	public void deleteAt(int i) {
		if ((this.data == null && next == null) || (i < 0)) {
			throw new IndexOutOfBoundsException();
		}

		if (i == 0) {
			deleteFirst();
			return;
		}

		if (next == null) {
			throw new IndexOutOfBoundsException();
		}
		next.deleteAt(i - 1);
		if (next.data == null && next.next == null) {
			setNext(null);
		} else {
			updateSize();
		}
	}

	public void removeDuplicates() {
		if (this.next != null) {
			LinkedListArnaud<T> begin = this;
			LinkedListArnaud<T> previous = this;
			LinkedListArnaud<T> current = previous.next;
			while (current != null) {
				while (previous.next != null && current.isDuplicate(begin)) {
					current.eliminateDuplicate(previous);
				}
				previous = previous.next;
				current = (previous != null) ? previous.next : null;
			}
		}
		updateSizeRecursive();
	}

	private void updateSizeRecursive() {
		if (next == null) {
			if (data == null) {
				size = 0;
			} else {
				size = 1;
			}
		} else {
			next.updateSizeRecursive();
			updateSize();
		}
	}

	private boolean isDuplicate(LinkedListArnaud<T> begin) {
		LinkedListArnaud<T> current = begin;
		boolean findDuplicate = false;
		while (current != null && current != this) {
			if ((data == null && current.data == null) || (data != null && data.equals(current.data))) {
				findDuplicate = true;
				break;
			}
			current = current.next;
		}

		return findDuplicate;
	}

	private void eliminateDuplicate(LinkedListArnaud<T> previous) {
		if (next != null) {
			this.data = next.data;
			this.next = next.next;
		} else {
			previous.next = null;
		}
	}

	@Override
	public void deleteItem(T data) {
		while ((this.data == null && data == null) || (this.data != null && this.data.equals(data))) {
			deleteFirst();
		}
		if (next != null) {
			next.deleteItem(data);
		}
		
		if (next != null && next.data == null && next.next == null) {
			next = null;
		}
		updateSize();
	}

	@Override
	public void display() {
		System.out.print(toString());
	}

	@Override
	public String toString() {
		StringBuffer retour = new StringBuffer();
		retour.append("L:");
		retour.append(this.data);

		LinkedListArnaud<T> current = next;
		while (current != null) {
			retour.append("->" + current.data);
			current = current.next;
		}

		if (this.data != null && this.next != null) {
			retour.append("->null\n");
		}
		return retour.toString();
	}

	@Override
	public boolean isPalindrome() {
		LinkedListArnaud<T> inverse = new LinkedListArnaud<T>(this.data);

		LinkedListArnaud<T> current = this.next;
		while (current != null) {
			inverse.addFirst(current.data);
			current = current.next;
		}

		return this.equals(inverse);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedListArnaud other = (LinkedListArnaud<?>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		return true;
	}

}

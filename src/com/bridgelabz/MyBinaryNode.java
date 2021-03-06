package com.bridgelabz;

public class MyBinaryNode<K extends Comparable<K>> {
	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> right;
	
	public MyBinaryNode(K key) {
		this.key=key;
		this.left=null;
		this.right=null;
	}
}

public class MyBinaryTreeTest{

public void given3NumbersWhenAddedToBSTShouldReturnSize3() {
MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
myBinaryTree.add(56);
myBinaryTree.add(30);
myBinaryTree.add(70);
int size = myBinaryTree.getSize();
Assert.assertEquals(3, size);
}
}

public class MybinaryTree<K extends Comparable<K>>{
	
	private MyBinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}
	
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key){
	if(current == null)
		return new MyBinaryNode<>(key);
	int compareResult = key.compareTo(current.key);
	if(compareResult == 0) return current;
	if(compareResult < 0) {
		current.left = addRecursively(current.left, key);
	}else {
		current.right = addRecursively(current.right, key);
	}
	return current;
	}
	public int getSize() {
		return this.getSizeRecursive(root);
	}
	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0: 1 + this.getSizeRecursive(current.left)+this.getSizeRecursive(current.right);
	}
}
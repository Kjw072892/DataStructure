package DataStructureLecture.ArrayList;

import java.util.Iterator;
/**
* ListADT defines the interface to a general list collection. Specific
* types of lists will extend this interface to complete the
* set of necessary operations.
*
* @author Lewis and Chase
* @version 4.0
*/
public interface ListADT<T> extends Iterable<T>
{
/**
* Removes and returns the first element from this list.
*
* @return the first element from this list
*/
T removeFirst();
/**
* Removes and returns the last element from this list.
*
* @return the last element from this list
*/
T removeLast();
/**
* Removes and returns the specified element from this list.
*
* @param element the element to be removed from the list
*/
T remove(T element);
/**
* Returns a reference to the first element in this list.
*
* @return a reference to the first element in this list
*/
T first();
/**
* Returns a reference to the last element in this list.
*
* @return a reference to the last element in this list
*/
T last();
/**
* Returns true if this list contains the specified target element.
*
* @param target the target that is being sought in the list
* @return true if the list contains this element
*/
boolean contains(T target);
/**
* Returns true if this list contains no elements.
*
* @return true if this list contains no elements
*/
boolean isEmpty();
/**
* Returns the number of elements in this list.
*
* @return the integer representation of number of elements in this list
*/
int size();
/**
* Returns an iterator for the elements in this list.
*
* @return an iterator over the elements in this list
*/
Iterator<T> iterator();
/**
* Returns a string representation of this list.
*
* @return a string representation of this list
*/
String toString();
}


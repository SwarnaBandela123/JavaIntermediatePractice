package Generics;

import java.util.ArrayList;
import java.util.List;

class genericClass<T> {
    // An object of type T is declared
    T obj;
    genericClass(T obj) { 
    	this.obj = obj; } // constructor
    public T getObject() {
    	return this.obj; }
}
 
// Driver class to test above
class Main {
    public static void main(String[] args)
    {
        // instance of Integer type
    	genericClass<Integer> iObj = new genericClass<Integer>(15);
        System.out.println(iObj.getObject());
 
        // instance of String type
        genericClass<String> sObj
            = new genericClass<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
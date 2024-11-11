package array_programs.p18.dynamic_array;

// Dynamic Array in Java
// Let's shrink the array, delete the last element,
// and a specified element from the array.

public class DynamicArrayExample2 {
    private int array[];
    private int count;
    private int sizeofarray;

    // creating a constructor of the class that initializes the values
    public DynamicArrayExample2() {
        array = new int[1];
        count = 0;
        sizeofarray = 1;
    }

    // creating a function that appends an element at the end of the array
    public void addElement(int a) {

        // compares if the number of elements is equals to the size of the array or not
        if (count == sizeofarray) {
            // invoking the growSize() method that creates an array of double size
            growSize();
        }

        // appends an element at the end of the array
        array[count] = a;
        count++;
    }

    // function that creates an array of double size
    public void growSize() {

        // declares a temp[] array
        int temp[] = null;
        if (count == sizeofarray) {
            // initialize a double size array of array
            temp = new int[sizeofarray * 2];
        }

        for (int i = 0; i < sizeofarray; i++) {
            // copies all the elements of the old array
            temp[i] = array[i];
        }

        array = temp;
        sizeofarray = sizeofarray * 2;
    }

    // creating a function that deletes an element at the specified index
    public void addElementAt(int index, int a) {

        // compare the size with the number of elements
        // if not equal grows the array size
        if (count == sizeofarray) {
            // invoking growSize() method
            growSize();
        }

        for (int i = count - 1; i >= index; i--) {

            // shifting all elements to the left from the specified index
            array[i + 1] = array[i];
        }

        // inserts an element at the specified index
        array[index] = a;
        count++;
    }

    // the method removes the unused space
    public void shrinkSize() {

        // declares a temp[] array
        int temp[] = null;
        if (count > 0) {
            // creates an array of the size equal to the count
            // i.e. number of elements the array have
            temp = new int[count];
            for (int i = 0; i < count; i++) {
                // copies all the elements of the old array
                temp[i] = array[i];
            }

            sizeofarray = count;
            array = temp;
        }
    }

    // creating a function that removes the last elements for the array
    public void removeElement() {
        if (count > 0) {
            array[count - 1] = 0;
            count--;
        }
    }

    // creating a function that deletes an element from the specified index
    public void removeElementAt(int index) {

        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1];
            }
            array[count - 1] = 0;
            count--;
        }
    }

    public static void main(String[] args) {

        DynamicArrayExample2 da = new DynamicArrayExample2();
        //adding elements to the array
        da.addElement(12);
        da.addElement(22);
        da.addElement(35);
        da.addElement(47);
        da.addElement(85);
        da.addElement(26);
        da.addElement(70);
        da.addElement(81);
        da.addElement(96);
        da.addElement(54);

        System.out.println("Elements of the array:");
        //iterate over the array for accessing the elements
        da.shrinkSize();
        for (int i = 0; i < da.sizeofarray; i++) {
            System.out.print(da.array[i] + " ");
        }
        System.out.println();

        //determines and prints the size and number of elements of the array
        System.out.println("Size of the array: " + da.sizeofarray);
        System.out.println("No. of elements in the array: " + da.count);

        //invoking the method to delete the last element of the array
        da.removeElement();
        //prints array after deleting the last element
        da.shrinkSize();
        System.out.print("\nElements of the array after deleting the last element: ");
        for (int i = 0; i < da.sizeofarray; i++) {
            System.out.print(da.array[i] + " ");
        }
        System.out.println();

        //determines and prints the size and number of elements of the array
        System.out.println("Size of the array: " + da.sizeofarray);
        System.out.print("No. of elements in the array: " + da.count + "\n");

        //invoking the method that deletes an element from the specified index
        da.removeElementAt(7);
        System.out.print("\nElements of the array after deleting the element at index 7: ");
        da.shrinkSize();
        //prints the array after deleting the element from index 7
        for (int i = 0; i < da.sizeofarray; i++) {
            System.out.print(da.array[i] + " ");
        }
        System.out.println();

        //determines and prints the size and number of elements of the array
        System.out.println("Size of the array: " + da.sizeofarray);
        System.out.print("No. of elements in the array: " + da.count);
    }

}

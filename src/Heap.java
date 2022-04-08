import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Heap {

    ArrayList<Integer> heaplist = new ArrayList<Integer>();
    int largest;

    public Heap maxHeapify(ArrayList<Integer> A, int i){
        int l = 2*i; //Left child index
        int r = 2*i+1; //Right child index

        if (l <= A.size() && A.get(l) > A.get(i)){ //Find largest child
            this.largest = l;
        } else {
            this.largest = i;
        }
        if (r <= A.size() && A.get(r) > A.get(this.largest)){
            this.largest = r;
        }

        if (this.largest != i){ //Given that one of the children were larger, swap places
            swap(A, this.largest, i);
        }


        return maxHeapify(A, this.largest); //Tager ikke højde for om man er nået til enden af listen.
    }

    private void swap(ArrayList<Integer> A, int i, int j){ //Swaps place in ArrayList A, given index i and j
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }

}

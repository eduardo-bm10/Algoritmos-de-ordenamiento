import java.util.ArrayList;

public class SortAlgorithms
{
    /*public ArrayList<T> selectionSort(ArrayList<T> list)
    {
        ArrayList<T> resultingList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
        {
            int comparison = list.get(i).compareTo(list.get(i+1));
            if (comparison > 0)
            {

            }
        }
        return resultingList;
    }*/

    public int[] bubbleSort(int[] list)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("List inserted is not an array");
        }
        for (int i = 0; i < list.length - 1; i++)
        {
            if (list[i] < (list[i+1]))
            {
                int tmp = list[i];
                list[i] = list[i+1];
                list[i+1] = tmp;
            }
        }
        return list;
    }

    /*public ArrayList<T> insertionSort(ArrayList<T> list)
    {
        ArrayList<T> orderedList = new ArrayList<>();
        orderedList.add(list.get(0));
        for (int i = 1; i < list.size(); i++)
        {
            int comparison = orderedList.get(0).compareTo(list.get(i));
            if (comparison < 0)
            {
                orderedList.add(list.get(i+1));
            }
            else if (comparison > 0)
            {
                orderedList.add(list.get(i));
            }
        }
        return orderedList;
    }*/
}

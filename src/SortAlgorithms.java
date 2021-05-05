import java.util.ArrayList;

public class SortAlgorithms<T extends Comparable<T>>
{
    public ArrayList<T> selectionSort(ArrayList<T> list)
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
    }

    public ArrayList<T> bubbleSort(ArrayList<T> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).compareTo(list.get(i + 1)) > 0)
            {
                T tmp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, tmp);
            }
            else{
                System.out.println("This one is in correct position");
            }
        }
        return list;
    }

    public ArrayList<T> insertionSort(ArrayList<T> list)
    {
        ArrayList<T> orderedList = new ArrayList<>();
        orderedList.add(list.get(0));
        for (int i = 1; i < list.size(); i++)
        {
            int comparison = orderedList.get(0).compareTo(list.get(i));
            if (comparison < 0)
            {
                orderedList.add
            }
            else if (comparison > 0)
            {
                orderedList.add(list.get(i));
            }
        }
        return orderedList;
    }
}

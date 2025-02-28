package lesson15;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        //Вариант 1 - передаем в конструктор 1 коллекцию и отдельно добавляем другую
        Collection<Integer> result = new ArrayList<>(a);
        result.addAll(b);
        return result;

        //Вариант 2 - создаем пустую коллекцию и отдельно добавляем остальные две
//        Collection<Integer> result = new ArrayList<>();
//        result.addAll(a);
//        result.addAll(b);
//        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new ArrayList<>(a);
        result.retainAll(b);
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();
        for (Integer element : a) {
            if (b.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new ArrayList<>();
        result.removeAll(b);
        return result;
    }
}

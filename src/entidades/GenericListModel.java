package entidades;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import javax.swing.DefaultListModel;

public  class GenericListModel<T> extends DefaultListModel<T> {
        private TreeSet<T> model = new TreeSet<T>();

        public GenericListModel() {
        }

        public GenericListModel(List<T> objects) {
            addAll(objects);
        }

        @Override
        public int getSize() {
            return model.size();
        }

        @Override
        public T getElementAt(int index) {
            return (T) model.toArray()[index];
        }

        public void add(T object) {
            if (model.add(object)) {
                fireContentsChanged(this, 0, getSize());
            }
        }

        public void addAll(List<T> quets) {
            for (T obj : quets) {
                model.add(obj);
            }

            fireContentsChanged(this, 0, getSize());
        }
        

        public void clear() {
            model.clear();
            fireContentsChanged(this, 0, getSize());
        }

        @Override
        public boolean contains(Object element) {
            return model.contains((T) element);
        }

        @Override
        public T firstElement() {
            return model.first();
        }

        public Iterator iterator() {
            return model.iterator();
        }

        @Override
        public T lastElement() {
            return model.last();
        }

        public void removeAll(Collection<?> elements) {
            for (Object element : elements) {
                removeElement(element);
            }

            fireContentsChanged(this, 0, getSize());
        }

        public boolean removeElement(Object element) {
            boolean removed = model.remove((T) element);
            if (removed) {
                fireContentsChanged(this, 0, getSize());
            }

            return removed;
        }
        
        @Override
        public T[] toArray(){
            return (T[]) model.toArray();
            
        }
   }
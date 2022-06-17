package com.Generics;

public class SingleGenericHolder<T> {

    private final T obj;

    SingleGenericHolder(T obj){
            this.obj=obj;
        }

        public  T getObj() {
        return this.obj;
        }


    public static void main(String[] args) {
        SingleGenericHolder<Integer> iobj = new SingleGenericHolder<Integer>(5);
        System.out.println(iobj.getObj());
        SingleGenericHolder<String> sobj = new SingleGenericHolder<String>("abcd");
        System.out.println(sobj.getObj());

    }
    }

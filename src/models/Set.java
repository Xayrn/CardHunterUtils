package models;

public enum Set{
    Base,AotA,Cit,AA,AI,CM;
    private final static Set[]values=Set.values();
    public static Set value(int i){return values[i];}
}
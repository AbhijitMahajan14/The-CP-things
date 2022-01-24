class Construct{
    public long mobile;
    public String name;

    Construct(long mob,String n)
    {
        mobile=mob;
        name=n;
        System.out.println("Costructor called");
    }

    public static void main(String[] args){
        Construct c=new Construct(7020203767l,"Abhijit");
        System.out.println(c.mobile+" "+c.name);

    }
}
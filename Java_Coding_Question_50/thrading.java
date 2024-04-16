package Java_Coding_Question_50;

public class thrading {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        singleton obj1=singleton.getinstance();
    }
}

class singleton
{
    public static singleton obj;
    
    private singleton()
    {
        System.out.println("Instance created");
    }

    public static singleton getinstance()
    {
        if(obj==null)
        {
            obj=new singleton();
        }

        return obj;
    }
}

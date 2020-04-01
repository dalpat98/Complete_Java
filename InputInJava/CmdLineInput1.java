// We can use command line input in java by this

public class CmdLineInput1{
    public static void main(String[] args) {
        // for this to work you have to give input at run time
        // like >>Java CmdLineInput  hyy this is dalpat here
        for(int i=0; i<args.length; i++)
        {
            System.out.print(args[i]);
            System.out.print("\n");
        }
        System.exit(0);
    }
}
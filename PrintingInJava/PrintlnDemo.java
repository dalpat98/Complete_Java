//Program to check for command line arguments

class PrintlnDemo{
    public static void main(String[] args) {
        //check if length of args array is greater than 0
        if(args.length>0)
        {
            System.out.println("The Command line"+
                               " arguments are :");
            //iterating the args array and printing
            //the command line arguments
            for(String val:args){
                System.out.println(val);
                // another way of using for loop
            }
        }
        else{
            System.out.println("No command line "+
                               "arguments found.");
        }
    }
}

//println() automatically take the cursor to next line whereas print() doesn't
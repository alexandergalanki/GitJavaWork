 for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=70 && avg<80)
        {
            System.out.print("C");
        }
            else if(avg>=60 && avg<70)
            {
                System.out.print("D");
            }
            else if(avg>=50 && avg<70)
            {
                System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
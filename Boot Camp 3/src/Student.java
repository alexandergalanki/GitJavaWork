class Student {
      private String name;
      private int regno;
      private int Mark;
      public  void setData(int regno, int Mark) 
      { 
    	  regno = regno;
    	  Mark = Mark;
          }
         public void getData() 
         { 

              System.out.println("Student Info :- ");
              System.out.println("regno " +regno+ "  Mark : " + Mark);
          }
    }


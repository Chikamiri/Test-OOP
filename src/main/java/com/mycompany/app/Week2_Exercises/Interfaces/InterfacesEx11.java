package com.mycompany.app.Week2_Exercises.Interfaces;

public class InterfacesEx11 {
    public class InterfacesEx11 implements Apply {

        
        public String process(Object input) {
            if (!(input instanceof String)) {
                throw new IllegalArgumentException("Input must be a String.");
            }
    
            String str = (String) input;
            StringBuilder result = new StringBuilder();
    
            for (int i = 0; i < str.length() - 1; i += 2) {
                // Swap characters by reversing two pairs at a time
                result.append(str, i + 1, i + 2);
                result.append(str, i, i + 1);
            }
    
            // Handle any leftover character if the string length is odd
            if (str.length() % 2 != 0) {
                result.append(str.charAt(str.length() - 1));
            }
    
            return result.toString();
        }
    }
   
    
}

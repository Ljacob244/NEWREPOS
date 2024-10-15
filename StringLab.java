public class StringLab
{

    public static void main(String args[])
    {
        String var1 = "Welcome to the String java lab!";

        System.out.println(var1.length());
        System.out.println(var1.charAt(7));
        System.out.println(var1.substring(15,19));
        System.out.println(var1.toUpperCase());
        System.out.println(var1.toLowerCase());
        System.out.println(var1.indexOf("Java"));
        System.out.println(var1.contains("Lab"));
        String replacedString = var1.replace("Java","Java Programming");
        System.out.println(replacedString);
      
        System.out.println(var1.contains("Lab"));

        
        String trimmedString = var1.trim();
        System.out.println(trimmedString);


        String compareStr = "java string lab!";
        boolean equals = var1.equals(compareStr);
        boolean equalsIgnoreCase = var1.equalsIgnoreCase(compareStr);
        System.out.println(equals);
        System.out.println(equalsIgnoreCase);



        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        System.out.println("After append: " + sb);
        int labIndex = sb.indexOf("Lab") + "Lab".length();
        sb.insert(labIndex, " is fun");
        System.out.println("After insert: " + sb);
        int learningStart = sb.indexOf("Learning");
        int learningEnd = learningStart + "Learning".length();
        sb.delete(learningStart, learningEnd);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);




        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        sbf.append(" - Learning Java");
        System.out.println("After append: " + sbf);
        int labIndex2 = sbf.indexOf("Lab") + "Lab".length(); 
        sbf.insert(labIndex, " is fun");
        System.out.println("After insert: " + sbf);
        int learningStart2 = sbf.indexOf("Learning");
        int learningEnd2 = learningStart + "Learning".length(); 
        System.out.println("After delete: " + sbf);

        sbf.reverse();
        System.out.println("After reverse: " + sbf);






        


    }










}
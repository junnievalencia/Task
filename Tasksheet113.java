
class PrimitivesConcat {

    public static void main(String[] args) {

        // Define primitives
        byte zero = 0;         
        short one = 1;         
        int three = 3;         
        float twoPointZero = 2.0f; 
        boolean isTrue = true;

        String output = "H" + three + one + one + zero + " w" + zero + "r" + one + "d " + twoPointZero + " " + isTrue;
        System.out.println(output);
    }
}


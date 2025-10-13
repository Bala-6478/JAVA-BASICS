class ENSURECAPACITY {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        // Default capacity of StringBuffer
        System.out.println(sb.capacity());  

        // Correct method name: ensureCapacity
        sb.ensureCapacity(42);

        // Updated capacity after ensuring minimum
        System.out.println(sb.capacity());
    }
}


package advancedjavaapplication.ThreadJavaProgram;


class Samplestring {
    public static void printWithDelay(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(300); // 0.3 seconds = 300 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // move to next line after each sentence
    }
    public static void main(String[] args) {

        printWithDelay("HAI");
        printWithDelay("HAI SIR HOW CAN I HELP YOU");
        printWithDelay("CAN YOU TELL ME ABOUT JAVA");
        printWithDelay("SURE, JAVA IS AN PROGRAMMING");
        printWithDelay("LANGUAGE WHICH IS USED FOR DEVELOP");
        printWithDelay("APPLICATIONS WITH PLATFORM");
        printWithDelay("INDEPENDENT");
    }
}

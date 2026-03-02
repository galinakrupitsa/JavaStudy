public class Winter {
    public String january;
    public String february;
   public Winter( String january, String february) {
        this.january = january;
        this.february = february;
   }
   public Winter(String january, String february, String december) {
       this.january = january + december;
       this.february = february;

   }
    public Winter(String january, String february, Integer year) {
        this.january = january + year;
        this.february = february;

    }
}

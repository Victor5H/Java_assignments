package multithreading.idesign1;


public class Article extends Thread {
    private String line;
    private Integer count =0;
    public Article(String line){
        this.line = line;
    }
    private synchronized void call(){
        this.start();
    }
    @Override
    public void run() {


    }
    public int getCount() {
        String [] arr = this.line.split(" ");
        for(String i: arr) {
            if (i.equalsIgnoreCase("a") || i.equalsIgnoreCase("an") || i.equalsIgnoreCase("the")) {
                this.count++;
            }
        }
        return this.count;
    }

}

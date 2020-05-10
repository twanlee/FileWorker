public class Client {
    private FileCalculator fileCalculator;
    public Client(FileCalculator fileCalculator){
        this.fileCalculator = fileCalculator;
    }
    public void printSize(String path){
        long size = fileCalculator.calculateSize(path);
        System.out.println("Size: " + size);

    }
}

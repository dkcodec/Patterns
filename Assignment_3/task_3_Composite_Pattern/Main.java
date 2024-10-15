package Assignment_3.task_3_Composite_Pattern;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        Directory dir1 = new Directory("Folder1");
        Directory dir2 = new Directory("Folder2");
        dir1.addComponent(file1);
        dir2.addComponent(file2);
        dir1.addComponent(dir2);
        dir1.showDetails(); // Output the contents of Folder1, including nested directories and files
    }

}

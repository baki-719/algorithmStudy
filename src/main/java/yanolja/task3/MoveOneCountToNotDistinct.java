package yanolja.task3;

import java.util.List;

public class MoveOneCountToNotDistinct {
    public int[] solution(int[] A) {
        // write your code in Java SE 8

        for (int i = 0; i < A.length/2; i++) {
            int temp = A[A.length-1-i];
            A[A.length-1-i] = A[i];
            A[i] = temp;
        }

        return A;
    }

    public void test2() {
        MyDirectory myDirectory = new MyDirectory(List.of(new MyFile(1),
                new MyFile(1),
                new MyFile(2),
                new MyFile(3)) ,
                List.of(new MyDirectory(List.of(new MyFile(1),
                        new MyFile(1),
                        new MyFile(2),
                        new MyFile(3)))));

        System.out.println(myDirectory.size);

    }

    class MyFile {
        public int size;

        public MyFile(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }
    }

    class MyDirectory {
        public List<MyFile> myFileList;
        public List<MyDirectory> subDirectory;

        public int size = 0;

        public MyDirectory(List<MyFile> myFileList, List<MyDirectory> subDirectory) {
            this.myFileList = myFileList;
            this.subDirectory = subDirectory;
            this.size = myFileList.stream().mapToInt(MyFile::getSize).sum();
            this.size += subDirectory.stream().mapToInt(MyDirectory::getSize).sum();
        }

        public MyDirectory(List<MyFile> myFileList) {
            this.myFileList = myFileList;
            this.size = myFileList.stream().mapToInt(MyFile::getSize).sum();
        }

        public int getSize() {
            return size;
        }
    }
}

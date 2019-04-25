package Uloha10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Filmy {
    private String[] films;
    public void nacitaj() throws IOException {
        BufferedReader citaj = new BufferedReader(new FileReader("D:\\filmy.txt"));
        films = new String[Integer.parseInt(citaj.readLine())];
        for (int i = 0; i < films.length; i++) {
            films[i] = citaj.readLine();
        }
        citaj.close();
    }
    public void quicksort(int left, int right) {     //podla abecedy
        if (left < right) {
            int boundary = left;
            for (int i = left + 1; i < right; i++) {
                if (films[i].compareTo(films[left]) < 0) {
                    swap(i, ++boundary);
                }
            }
            swap(left, boundary);
            quicksort(left, boundary);
            quicksort(boundary + 1, right);
        }
    }
    private void swap(int left, int right) {
        String tmp = films[right];
        films[right] = films[left];
        films[left] = tmp;
    }
    public void komunikuj() throws IOException {
        BufferedReader citaj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ktory film sa bude premietat v tomto mesiaci?");
        String vstup = citaj.readLine().toLowerCase();
        while (vstup.compareTo("") > 0) {
            if (binarySearch(0, films.length - 1, vstup) != -1) System.out.println("Film sa bude premietat");
            else System.out.println("Film sa nebude premietat");
            System.out.println("Ktory film sa bude premietat v tomto mesiaci?");
            vstup = citaj.readLine();
        }
        citaj.close();
    }
    public int binarySearch(int leftIndex, int rightIndex, String value) {
        while (rightIndex-leftIndex>1) {
            int middleIndex = leftIndex+(rightIndex-leftIndex) / 2;
            if (films[middleIndex].toLowerCase().compareTo(value.toLowerCase()) > 0) rightIndex = middleIndex--;
            else if (films[middleIndex].toLowerCase().compareTo(value.toLowerCase()) < 0) leftIndex = middleIndex++;
            else if (leftIndex == rightIndex && films[leftIndex].toLowerCase().equals(value.toLowerCase()) == false) break;
            else return middleIndex;
        }
        return -1;
    }
    public void vypis() {
        for (int i = 0; i < films.length; i++) {
            System.out.println(films[i]);
        }
        System.out.println();
    }
}

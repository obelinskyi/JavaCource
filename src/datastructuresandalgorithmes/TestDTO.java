package datastructuresandalgorithmes;

import java.util.Objects;

public class TestDTO {
    private String aaa;
    private String bbb;
    private System ccc;


    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    public String getBbb() {
        return bbb;
    }

    public void setBbb(String bbb) {
        this.bbb = bbb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestDTO testDTO = (TestDTO) o;
        return Objects.equals(aaa, testDTO.aaa) &&
                Objects.equals(bbb, testDTO.bbb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aaa, bbb);
    }

    public static void main(String[] args) {
        System.out.println(Character.hashCode('a'));
    }
}

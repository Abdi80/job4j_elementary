package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {58, 89, 77};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {58, 77, 89};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {77};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {77};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {9, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 9};
        assertThat(result).containsExactly(expected);
    }

}
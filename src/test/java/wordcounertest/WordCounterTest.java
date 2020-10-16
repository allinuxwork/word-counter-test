package wordcounertest;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import wordcounertest.service.CountWordService;

import java.io.File;
import java.io.IOException;

import java.util.Map;

public class WordCounterTest {

    @Test
    public void bookTest() throws IOException {

        CountWordService countWordService = new CountWordService();
        String data = FileUtils.readFileToString(new File(this.getClass().getClassLoader().getResource("TheLordoftheRings.txt").getFile()), "cp1251");

        Map<String, Long> stringLongMap = countWordService.countWord(data);
        Assertions.assertEquals(82l, stringLongMap.get("story"));
    }
}
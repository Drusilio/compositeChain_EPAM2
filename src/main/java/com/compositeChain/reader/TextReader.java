package com.compositeChain.reader;

import com.compositeChain.exception.UserTextException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextReader {
    private static Logger logger = LogManager.getLogger();

    public String readFromFile(String filename) throws UserTextException {
        String text;
        try {
            text = Files.readString(Paths.get(filename));
            logger.log(Level.INFO, "Text is " + text);
        } catch (IOException ex) {
            logger.log(Level.ERROR, "Incorrect filename " + filename);
            throw new UserTextException("Incorrect filename " + filename);
        }
        return text;
    }
}

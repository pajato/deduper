/*
 * Copyright (C) 2016 Pajato Technologies LLC.
 *
 * This file is part of Pajato deduper.

 * deduper is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.

 * deduper is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.

 * You should have received a copy of the GNU General Public License along with deduper.  If not,
 * see http://www.gnu.org/licenses
 */

package com.pajato.deduper;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;

public class MainTest {

    @Test public void test0() {
        runTest("20 3 9 9 11 11 11 11 89 89 100 100 101 102 103 108 200 250 250 250 250",
                "3 9 11 89 100 101 102 103 108 200 250");
    }

    private void runTest(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Main.main(null);
        String actual = out.toString().trim();
        assertEquals(expected, actual);
        System.setOut(stdout);
        System.out.println(actual);
    }
}

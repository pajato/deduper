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

package com.pajato.deduper.util;

import java.io.*;
import java.util.*;

/** Provide a class to model a linked list node. */
public class Node {

    public int data;
    public Node next;

    public Node(final int d) {
        data = d;
        next = null;
    }
}

/*
 * Copyright (C) 2009 by the geOrchestra PSC
 *
 * This file is part of geOrchestra.
 *
 * geOrchestra is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * geOrchestra is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * geOrchestra.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.georchestra.mapfishapp.ws;

import javax.sql.DataSource;

/**
 * This service handles the storage and the loading of a WKT file on a temporary
 * directory.
 * 
 * @author yoann buch - yoann.buch@gmail.com
 *
 */

public class WKTDocService extends A_DocService {

    public static final String FILE_EXTENSION = ".wkt";
    public static final String MIME_TYPE = "text/plain";

    public WKTDocService(final String tempDir, DataSource pgpool) {
        super(FILE_EXTENSION, MIME_TYPE, tempDir, pgpool);
    }

    /**
     * Called before saving the content
     * 
     * @throws DocServiceException
     */
    @Override
    protected void preSave() throws DocServiceException {

    }

    /**
     * Called right after the loading of the file content
     * 
     * @throws DocServiceException
     */
    @Override
    protected void postLoad() throws DocServiceException {

    }

}

/*
 * Copyright (c) Avram Lyon, 2014.
 *
 * This file is part of libzotero-java.
 *
 * libzotero-java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * libzotero-java is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with libzotero-java.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.gimranov.libzotero.persist;

import com.gimranov.libzotero.model.*;
import rx.Observable;

import java.util.List;
import java.util.Map;

public interface IPersistence {
    public <T> void persist(String itemKey, T item);
    public <T> void persist(Map<String, T> items);
    public <T> Observable<T> load(String key, Class<T> tClass);
    public <T> Observable<T> load(Class<T> tClass);

    public void persist(ObjectVersions objectVersions);
    public Observable<Integer> loadItemVersion(String key);

    public void persistLibraryVersion(int libraryVersion);
    public Observable<Integer> loadLibraryVersion();
}

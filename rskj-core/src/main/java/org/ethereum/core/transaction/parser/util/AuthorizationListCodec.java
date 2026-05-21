/*
 * This file is part of RskJ
 * Copyright (C) 2026 RSK Labs Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.ethereum.core.transaction.parser.util;

import java.math.BigInteger;

public final class AuthorizationListCodec {

    private static final int TUPLE_FIELD_COUNT = 6;
    private static final BigInteger MAX_CHAIN_ID = BigInteger.ONE.shiftLeft(256);
    private static final BigInteger MAX_NONCE = BigInteger.ONE.shiftLeft(64).subtract(BigInteger.ONE);


}

/*
 * Copyright 2021 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.incubator.codec.quic;

public enum QuicTokenType {
    /**
     * Retry token for retry packet.
     */
    RETRY((byte) 1),

    /**
     * New token for NEW_TOKEN frame.
     */
    NEW((byte) 2);

    final byte type;

    QuicTokenType(byte type) {
        this.type = type;
    }

    /**
     * Return the {@link QuicTokenType} for the given byte.
     *
     * @param type  the byte that represent the type.
     * @return      the {@link QuicTokenType}.
     */
    static QuicTokenType of(byte type) {
        switch(type) {
            case 1:
                return RETRY;
            case 2:
                return NEW;
            default:
                throw new IllegalArgumentException("Unknown QUIC token type: " + type);
        }
    }
}

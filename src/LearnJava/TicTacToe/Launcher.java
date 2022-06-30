/*
 *
 *  * Copyright (c) 2022. sheralievnursultan1@gmail.com
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  *
 *
 */

package LearnJava.TicTacToe;

import LearnJava.TicTacToe.component.*;

/**
 * @author Nursultan
 * Sheralievnursultan@gmail.com
 */
public class Launcher {
    public static void main(String[] args) {

        final Game game = new Game(
                new DataPrinter(), new ComputerMove(), new UserMove(), new WinnerVeryfier(), new DrawVeryfier()
        );
        game.Play();
    }
}

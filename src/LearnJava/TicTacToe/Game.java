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

import java.util.Random;

/**
 * @author Nursultan
 * Sheralievnursultan@gmail.com
 */
public class Game {

    private final DataPrinter dataPrinter;

    private final ComputerMove computerMove;

    private final UserMove userMove;

    private final WinnerVeryfier winnerVeryfier;

    private final DrawVeryfier drawVeryfier;

    public Game(final DataPrinter dataPrinter,
                final ComputerMove computerMove,
                final UserMove userMove,
                final WinnerVeryfier winnerVeryfier,
                final DrawVeryfier drawVeryfier) {
        this.dataPrinter = dataPrinter;
        this.computerMove = computerMove;
        this.userMove = userMove;
        this.winnerVeryfier = winnerVeryfier;
        this.drawVeryfier = drawVeryfier;
    }

    public void Play() {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        dataPrinter.printMappingTable();
        final GameTable gameTable = new GameTable();
        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
        }
        while (true) {
            userMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVeryfier.isUserWin(gameTable)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (drawVeryfier.isDraw(gameTable)) {
                System.out.println("SORRY, DRAW!");
                break;
            }
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVeryfier.isComputerWin(gameTable)) {
                System.out.println("COMPUTER WIN!");
                break;
            }
            if (drawVeryfier.isDraw(gameTable)) {
                System.out.println("SORRY, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
    }
}

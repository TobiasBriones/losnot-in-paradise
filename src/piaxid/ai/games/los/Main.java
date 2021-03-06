/*
 * Copyright (c) 2018-2021 Tobias Briones. All rights reserved.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 *
 * This file is part of Losnot in Paradise.
 *
 * This source code is licensed under the BSD-3-Clause License found in the
 * LICENSE file in the root directory of this source tree or at
 * https://opensource.org/licenses/BSD-3-Clause.
 */

package piaxid.ai.games.los;

import piaxid.ai.games.los.ui.MainWindow;

import javax.swing.*;

public final class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::run);
    }

    private static void run() {
        final var mw = new MainWindow();
        final var game = new LosGame();

        game.run();
        game.displayOn(mw.getOutputContainer());
        mw.createUI();
    }

    private Main() {}

}

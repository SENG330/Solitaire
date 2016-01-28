/*******************************************************************************
 * Solitaire
 *
 * Copyright (C) 2016 by Martin P. Robillard
 *
 * See: https://github.com/prmr/Solitaire
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package ca.mcgill.cs.stg.solitaire.ai;

import ca.mcgill.cs.stg.solitaire.model.GameModelView;
import ca.mcgill.cs.stg.solitaire.model.Move;

/**
 * Defines the behavior necessary to make 
 * a decision.
 */
public interface PlayingStrategy
{
	/**
	 * If a move is both legal and supported 
	 * by the concrete strategy, execute the move. If
	 * not, do nothing.
	 * @param pModel A game model to query.
	 * @return The next move.
	 */
	Move computeNextMove(GameModelView pModel);
}

/*
Copyright 2012 James Edwards

This file is part of Jhrome.

Jhrome is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Jhrome is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with Jhrome.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.sexydock.tabs.launchers;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import org.sexydock.tabs.JhromeTabbedPaneUI;
import org.sexydock.tabs.Tab;

public class NewJhromeTest
{
	public static void main( String[ ] args )
	{
		SwingUtilities.invokeLater( new Runnable( )
		{
			@Override
			public void run( )
			{
				JFrame window = new JFrame( );
				JTabbedPane tabbedPane = new JTabbedPane( );
				JhromeTabbedPaneUI tabbedPaneUI = new JhromeTabbedPaneUI( );
				tabbedPane.setUI( tabbedPaneUI );
				tabbedPane.setBorder( new EmptyBorder( 5 , 5 , 5 , 5 ) );
				window.getContentPane( ).add( tabbedPane , BorderLayout.CENTER );
				
				for( int i = 0 ; i < 1 ; i++ )
				{
					Tab defaultTab = new Tab( "Tab " + i );
					tabbedPaneUI.addTab( i , defaultTab );
					tabbedPaneUI.setSelectedTab( defaultTab );
				}
				
				window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				window.setSize( new Dimension( 800 , 600 ) );
				window.setLocationRelativeTo( null );
				window.setVisible( true );
			}
		} );
	}
}
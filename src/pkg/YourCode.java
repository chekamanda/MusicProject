package pkg;

//Shaolin_Dub_-_07_-_Billowing_Smoke 
//Total  363 Beats (Remaining : 13 Beats) => The End pattern
// Things to do , boggleEye (eye whites)
import ryanguru.ColorDisplay;

public class YourCode {

	public static void flappyBird(int c, String color)
	{
		// Clear Screen
		ColorDisplay.setScreenOFF();

		ColorDisplay.pause(200);
		// outline
		int[] outlineRow = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
				2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
				4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,
				6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9 };
		int[] outlineCol = { 5, 6, 7, 8, 9, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 1, 2, 3, 4, 5, 6, 7,
				8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 2,
				3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 7, 8, 9, 10, 11, 12, 13 };

		for (int x = 0; x < outlineRow.length; x++)
		{

			// Selected index to change change color
			if (x == 7 || x == 8 || x == 9 || x == 10 || x == 11 || x == 20 || x == 21 || x == 22 || x == 23 || x == 24
					|| x == 25 || x == 38 || x == 39 || x == 40)
			{

				// If even
				if (c % 2 == 0)
				{
					ColorDisplay.setPixelColor(outlineRow[x], outlineCol[x], color);
				} else
				{
					// odd
					ColorDisplay.setPixelColor(outlineRow[x], outlineCol[x], "LIGHTGRAY");
				}

			} else if (x == 27 || x == 28 || x == 29 || x == 30 || x == 31 || x == 32 || x == 33 || x == 42 || x == 60
					|| x == 61 || x == 62 || x == 63 || x == 64 || x == 65 || x == 66 || x == 67)
			{

				ColorDisplay.setPixelColor(outlineRow[x], outlineCol[x], "RED");

			} else if (x == 52 || x == 53 || x == 54 || x == 56 || x == 57 || x == 58 || x == 74 || x == 75 || x == 76
					|| x == 77 || x == 78 || x == 89 || x == 90 || x == 91 || x == 92 || x == 93 || x == 102 || x == 103
					|| x == 104 || x == 105 || x == 113 || x == 114 || x == 115 || x == 116)
			{
				if (c % 2 == 0)
				{
					ColorDisplay.setPixelColor(outlineRow[x], outlineCol[x], color);
				} else
				{
					ColorDisplay.setPixelColor(outlineRow[x], outlineCol[x], "YELLOW");
				}
			} else if (x == 70 || x == 71 || x == 72 || x == 95 || x == 96 || x == 97 || x == 98 || x == 99 | x == 107
					|| x == 108 || x == 110 || x == 118 || x == 119)
			{
				ColorDisplay.setPixelColor(outlineRow[x], outlineCol[x], "WHITE");
			}

			else
			{
				// if index not stated in the previous conditions,
				// it will be printed black
				ColorDisplay.setPixelColor(outlineRow[x], outlineCol[x], "BLACK");

			}
		}

	}

	public static void shades(int offset, String color)
	{
		// clear Screen
		ColorDisplay.setScreenOFF();

		// outline
		int[] shadesRow = { 8, 8, 8, 8, 8, 8, 8, 8, 7, 7, 7, 7, 7, 7, 7, 7, 6, 6, 6, 6, 6, 6, 5, 5, 5, 5, 4, 4, 4 };
		int[] shadesCol = { 0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 7, 2, 3, 4, 6, 3, 4, 5 };

		for (int i = 0; i < shadesRow.length; i++)
		{
			// left shades
			ColorDisplay.setPixelColor(shadesRow[i] - offset, shadesCol[i], color);
			// left shade's reflection
			ColorDisplay.setPixelColor(5 - offset, 5, "WHITE");
			ColorDisplay.setPixelColor(6 - offset, 6, "WHITE");

			// right shades
			ColorDisplay.setPixelColor(shadesRow[i] - offset, shadesCol[i] + 12, color);
			// right shade's reflection
			ColorDisplay.setPixelColor(5 - offset, 5 + 12, "WHITE");
			ColorDisplay.setPixelColor(6 - offset, 6 + 12, "WHITE");
		}

		// linking both shades
		for (int x = 8; x <= 11; x++)
		{
			ColorDisplay.setPixelColor(8 - offset, x, color);
		}

	}

	public static void Balloon(int offset, String color)
	{
		// clear Screen
		ColorDisplay.setScreenOFF();
		int[] row = { 1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8 }; // outline
		int[] colm = { 1, 2, 2, 1, 3, 0, 4, 0, 4, 0, 4, 1, 2, 3 }; // outline
		int[] cRow = { 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7 }; // color
		int[] cColm = { 2, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3 }; // color

		for (int i = 0; i < row.length; i++) // outline
		{
			if ((row[i] + offset <= 9) && (colm[i] + offset + 6 <= 19) && (colm[i] + offset + 12 <= 19))
			{
				ColorDisplay.setPixelColor(row[i] + offset, colm[i], "BLACK");
				ColorDisplay.setPixelColor(row[i] + offset, colm[i] + offset + 6, "BLACK");
				ColorDisplay.setPixelColor(row[i] + offset, colm[i] + offset + 12, "BLACK");
			}
		}
		for (int i = 0; i < cRow.length; i++) // outline
		{
			if (cRow[i] + offset <= 9 && cColm[i] + offset + 12 <= 19 && cColm[i] + offset + 6 <= 19)
			{
				ColorDisplay.setPixelColor(cRow[i] + offset, cColm[i], color);
				ColorDisplay.setPixelColor(cRow[i] + offset, cColm[i] + offset + 6, color);
				ColorDisplay.setPixelColor(cRow[i] + offset, cColm[i] + offset + 12, color);

			}
		}
	}

	public static void heartFilled(int c)
	{
		// Clear Screen
		ColorDisplay.setScreenOFF();
		// outline
		int[] outlineRow = { 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 8, 7, 7, 6 };
		int[] outlineCol = { 10, 9, 11, 8, 12, 7, 13, 6, 14, 5, 15, 5, 15, 6, 14, 7, 8, 12, 13, 9, 11, 10 };

		for (int x = 0; x < outlineRow.length; x++)
		{
			ColorDisplay.setPixelColor(outlineRow[x], outlineCol[x], "BLACK");
		}

		int min = 0, max = 0;

		// printing filling heart
		for (int row = 1; row <= 7; row++)
		{
			min = 10 - (row - 1);
			max = 10 + (row - 1);

			if (row <= 5)
			{
				for (int col = min; col <= max; col++)
				{
					ColorDisplay.setPixelColor(row, col, "RED");
				}

			} else if (row == 6)
			{
				for (int col = min; col <= max; col++)
				{
					if (col != 5 && col != 10 && col != 15)
					{
						ColorDisplay.setPixelColor(6, col, "RED");
					}
				}
			} else if (row == 7)
			{
				for (int col = min; col <= max; col++)
				{
					if (col == 7 || col == 8 || col == 12 || col == 13)
					{
						ColorDisplay.setPixelColor(7, col, "RED");
					}
				}
			}
			ColorDisplay.pause(50);
		}

		// clearing filled heart

		for (int row = 7; row >= 1; row--)
		{
			min = 10 - (row - 1);
			max = 10 + (row - 1);

			if (row <= 5)
			{
				for (int col = min; col <= max; col++)
				{
					ColorDisplay.setPixelOFF(row, col);
				}

			} else if (row == 6)
			{
				for (int col = min; col <= max; col++)
				{
					if (col != 5 && col != 10 && col != 15)
					{
						ColorDisplay.setPixelOFF(row, col);
					}
				}
			} else if (row == 7)
			{
				for (int col = min; col <= max; col++)
				{
					if (col == 7 || col == 8 || col == 12 || col == 13)
					{
						ColorDisplay.setPixelOFF(row, col);
					}
				}
			}
			ColorDisplay.pause(50);
		}

	}

	public static void du(int offset)
	{
		int[] Drows = { 4, 4, 5, 5, 6, 6 }; // D
		int[] Dcols = { 2, 3, 2, 4, 2, 3 };// D
		int[] Urows = { 4, 4, 4, 5, 5, 6, 6 }; // u
		int[] Ucols = { 5, 6, 7, 5, 7, 5, 7 };// u

		for (int i = 0; i <= Drows.length - 1; i++) // D
		{
			ColorDisplay.setPixelColor(Drows[i], Dcols[i] + offset, "BLACK");
		}
		for (int i = 0; i <= Urows.length - 1; i++) // U
		{
			ColorDisplay.setPixelColor(Urows[i], Ucols[i] + offset, "BLACK");
		}

	}

	public static void cactus(int c, String color)
	{
		// clear Screen
		ColorDisplay.setScreenOFF();
		int[] row = { 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8,
				8, 8, 9, 9 };
		int[] colm = { 7, 10, 7, 10, 5, 6, 7, 10, 4, 10, 3, 6, 7, 11, 12, 13, 2, 5, 7, 14, 2, 4, 7, 10, 11, 12, 15, 3,
				7, 10, 13, 15, 7, 10, 14, 8, 9 };
		int[] colorColm = { 8, 9, 8, 9, 8, 9, 5, 6, 7, 8, 9, 4, 5, 8, 9, 10, 3, 4, 8, 9, 10, 11, 12, 13, 8, 3, 8, 9, 13,
				14, 8, 9, 14, 8, 9 };
		int[] colorRow = { 0, 0, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7,
				7, 7, 8, 8, };
		for (int x = 0; x < row.length; x++) // moving till beat%5
		{
			ColorDisplay.setPixelColor(row[x], colm[x], "BLACK");
		}
		for (int x = 0; x < colorRow.length; x++) // fixed ,color
		{
			if (c % 2 == 0)
			{

				ColorDisplay.setPixelColor(colorRow[x], colorColm[x], color);
			} else
			{
				ColorDisplay.setPixelColor(colorRow[x], colorColm[x], "GREEN");

			}
		}
	}

	public static void pixel(int beat)
	{
		ColorDisplay.setScreenOFF();
		for (int row = 0; row < 8; row++)
		{
			for (int col = 0; col < 19; col++)
			{
				if (col % 2 == 1)
				{
					ColorDisplay.setPixelColor(row, col, "RED");

					if (row >= 5)
					{
						ColorDisplay.setPixelColor(row, col, "ORANGE");
					}
				}
			}
			if (row == 7)
			{
				for (int r = 8; r >= 0; r--)
				{
					for (int c = 19; c >= 0; c--)
					{
						ColorDisplay.setPixelOFF(r, c);
					}

					ColorDisplay.pause(50);
				}
			}
		}
	}

	public static void pokeball(int offset, String color)
	{
		ColorDisplay.setScreenOFF();
		// outline
		int[] outlineRow = { 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
				5, 5, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8 };
		int[] outlineCol = { 7, 8, 9, 10, 11, 12, 6, 13, 5, 14, 4, 8, 9, 10, 11, 15, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
				13, 14, 15, 16, 4, 8, 9, 10, 11, 15, 5, 14, 6, 13, 7, 8, 9, 10, 11, 12 };

		for (int x = 0; x < outlineRow.length; x++)
		{
			ColorDisplay.setPixelColor(outlineRow[x] + offset, outlineCol[x], "BLACK");
		}

		// Color
		int[] colorRow = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3 };
		int[] colorCol = { 7, 8, 9, 10, 11, 12, 6, 7, 8, 9, 10, 11, 12, 13, 5, 6, 7, 12, 13, 14 };

		for (int x = 0; x < colorRow.length; x++)
		{
			if (offset == 0)
			{
				// set color
				ColorDisplay.setPixelColor(colorRow[x] + offset, colorCol[x], color);
				ColorDisplay.setPixelColor(8 - colorRow[colorRow.length - x - 1] + offset,
						colorCol[colorRow.length - x - 1], "WHITE");
			}

			else
			{
				// set color
				ColorDisplay.setPixelColor(8 - colorRow[colorRow.length - x - 1] + offset,
						colorCol[colorRow.length - x - 1], color);
				ColorDisplay.setPixelColor(colorRow[x] + offset, colorCol[x], "WHITE");
			}
		}

	}

	public static void rainbowHeart(int c)
	{
		// clear Screen
		ColorDisplay.setScreenOFF();

		// outline
		int[] outlineRow = { 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 8, 7, 7, 6 };
		int[] outlineCol = { 10, 9, 11, 8, 12, 7, 13, 6, 14, 5, 15, 5, 15, 6, 14, 7, 8, 12, 13, 9, 11, 10 };

		for (int x = 0; x < outlineRow.length; x++) // outline
		{
			ColorDisplay.setPixelColor(outlineRow[x], outlineCol[x], "BLACK");
		}

		// Color
		int[] colorRow = { 2, 3, 4, 5, 3, 4, 5, 6, 4, 5, 6, 5, 6, 7, 6, 7 };
		int[] colorCol = { 9, 8, 7, 6, 9, 8, 7, 6, 9, 8, 7, 9, 8, 7, 9, 8 };

		if (c % 2 == 0) // even
		{
			for (int x = 0; x < colorRow.length; x++)
			{
				if (x >= 0 && x <= 3)
				{
					ColorDisplay.setPixelColor(colorRow[x], colorCol[x] + (2 * x + 2), "RED");
				} else if (x >= 4 && x <= 7)
				{
					ColorDisplay.setPixelColor(colorRow[x], colorCol[x] + (2 * (x % 4) + 2), "ORANGE");
				} else if (x >= 8 && x <= 10)
				{
					ColorDisplay.setPixelColor(colorRow[x], colorCol[x] + (2 * (x % 4) + 2), "GREEN");
				} else if (x >= 11 && x <= 13)
				{
					// need to +1 cause 11%4=3, +1 to make 12%4=0
					ColorDisplay.setPixelColor(colorRow[x], colorCol[x] + (2 * ((x + 1) % 4) + 2), "CYAN");
				} else // start from 14
				{
					// need to +2 cause 14%4=2, +2 to make 16%4=0
					ColorDisplay.setPixelColor(colorRow[x], colorCol[x] + (2 * ((x + 2) % 4) + 2), "BLUE");
				}
			}

		} else
		{
			for (int x = 0; x < colorRow.length; x++)
			{
				if (x >= 0 && x <= 3)
				{
					ColorDisplay.setPixelColor(colorRow[x], colorCol[x], "RED");
				} else if (x >= 4 && x <= 7)
				{
					ColorDisplay.setPixelColor(colorRow[x], colorCol[x], "ORANGE");
				} else if (x >= 8 && x <= 10)
				{
					ColorDisplay.setPixelColor(colorRow[x], colorCol[x], "GREEN");
				} else if (x >= 11 && x <= 13)
				{
					ColorDisplay.setPixelColor(colorRow[x], colorCol[x], "CYAN");
				} else
				{
					ColorDisplay.setPixelColor(colorRow[x], colorCol[x], "BLUE");
				}

			}
		}

		// fixed color
		for (int x = 1; x < 6; x++)
		{
			if (x == 1)
				ColorDisplay.setPixelColor(x, 10, "RED");
			else if (x == 2)
				ColorDisplay.setPixelColor(x, 10, "ORANGE");
			else if (x == 3)
				ColorDisplay.setPixelColor(x, 10, "GREEN");
			else if (x == 4)
				ColorDisplay.setPixelColor(x, 10, "CYAN");
			else if (x == 5)
				ColorDisplay.setPixelColor(x, 10, "BLUE");
		}
	}

	public static void boggleEyed(int c)
	{
		ColorDisplay.setScreenOFF();
		// outline
		int[] outlineRow = { 3, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9 };
		int[] outlineCol = { 3, 4, 5, 6, 2, 7, 1, 8, 1, 8, 1, 8, 2, 7, 3, 4, 5, 6 };

		for (int x = 0; x < outlineRow.length; x++)
		{
			// left eye
			ColorDisplay.setPixelColor(outlineRow[x], outlineCol[x], "BLACK");

			// right eye
			ColorDisplay.setPixelColor(outlineRow[x], outlineCol[x] + 10, "BLACK"); // mirrored side

		}

		// mouth

		// clear mouth
		for (int row = 0; row <= 1; row++)
		{
			for (int col = 7; col <= 12; col++)
			{
				ColorDisplay.setPixelOFF(row, col);

			}

		}

		// print mouth
		for (int row = 0; row <= 1; row++)
		{
			for (int col = 7; col <= 12; col++)
			{

				if (c % 2 == 0)// even
				{
					ColorDisplay.setPixelColor(row, col, "RED");
				} else if (c % 2 == 1 && row == 1) // odd
				{
					ColorDisplay.setPixelColor(row, col, "RED");
				}

			}

		}

		// Eyeball

		if (c % 2 == 0) // when its even
		{

			// clear left big eye
			for (int row = 5; row <= 7; row++)
			{
				ColorDisplay.setPixelOFF(row, 14);
				ColorDisplay.setPixelOFF(row, 15);
			}

			// clear right small eye
			ColorDisplay.setPixelOFF(6, 4);
			ColorDisplay.setPixelOFF(6, 5);

			// print left big eye
			for (int row = 5; row <= 7; row++)
			{
				ColorDisplay.setPixelColor(row, 4, "BLACK");
				ColorDisplay.setPixelColor(row, 5, "BLACK");
			}

			// print right small eye
			ColorDisplay.setPixelColor(6, 14, "BLACK");
			ColorDisplay.setPixelColor(6, 15, "BLACK");

		} else
		// if its odd
		{
			// clear left big eye
			for (int row = 5; row <= 7; row++)
			{
				ColorDisplay.setPixelOFF(row, 4);
				ColorDisplay.setPixelOFF(row, 5);
			}

			// clear right small eye
			ColorDisplay.setPixelOFF(6, 14);
			ColorDisplay.setPixelOFF(6, 15);

			// left big eye
			for (int row = 5; row <= 7; row++)
			{
				ColorDisplay.setPixelColor(row, 14, "BLACK");
				ColorDisplay.setPixelColor(row, 15, "BLACK");
			}

			// right small eye
			ColorDisplay.setPixelColor(6, 4, "BLACK");
			ColorDisplay.setPixelColor(6, 5, "BLACK");

		}
	}

	public static void rocket(int offset)
	{
		ColorDisplay.setScreenOFF();
		int[] row = { 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7 };
		int[] col = { 4, 5, 6, 7, 8, 7, 5, 6, 7, 7, 7, 7, 8 };
		int[] Fixrow = { 0, 1, 2, 6, 7, 8 };
		int[] colorRow = { 2, 2, 3, 4, 5, 6, 6, 3, 4, 5 };
		int[] colorColm = { 6, 8, 8, 8, 8, 8, 9, 9, 9, 9 };
		for (int i = 0; i <= row.length - 1; i++)
		{
			if (row[i] + offset <= 9 && 18 - col[i] <= 19 && col[i] <= 19)
			{
				ColorDisplay.setPixelColor(row[i] + offset, col[i], "BLACK");
				ColorDisplay.setPixelColor(row[i] + offset, 18 - col[i], "BLACK"); // mirrored side
			}

		}
		for (int i = 0; i <= Fixrow.length - 1; i++) // non-mirrored side
		{
			if (Fixrow[i] + offset <= 9)
			{
				ColorDisplay.setPixelColor(Fixrow[i] + offset, 9, "BLACK");
			}

		}
		for (int i = 0; i <= colorRow.length - 1; i++) // color
		{
			if (colorRow[i] + offset <= 9 && 18 - colorColm[i] <= 19)
			{
				ColorDisplay.setPixelColor(colorRow[i] + offset, colorColm[i], "RED");
				ColorDisplay.setPixelColor(colorRow[i] + offset, 18 - colorColm[i], "RED"); // mirrored side
			}
		}

	}

	public static void bubble(int offset, int beat, String color)
	{
		ColorDisplay.setScreenOFF();

		int[] row = { 0, 1, 1, 2, 2, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8 }; // outline
		int[] col = { 2, 3, 4, 2, 3, 5, 6, 7, 1, 8, 0, 9, 0, 9, 0, 9, 1, 8, 2, 3, 4, 5, 6, 7 }; // outline
		int[] colorRow = { 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6,
				7, 7, 7, 7, 7, 7 };
		int[] colorCol = { 4, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8,
				2, 3, 4, 5, 6, 7 };

		if (offset != 0) // offset not equal to 0 +offset
		{

			for (int i = 0; i <= row.length - 1; i++) // outline
			{
				ColorDisplay.setPixelColor(row[i], col[i] + offset, "BLACK");
			}
			for (int i = 0; i <= colorRow.length - 1; i++) // color
			{
				ColorDisplay.setPixelColor(colorRow[i], colorCol[i] + offset, color);
			}
		}

		else if (offset == 0) // going back to the start
		{
			for (int i = 0; i <= row.length - 1; i++) // outline
			{
				ColorDisplay.setPixelColor(row[i], col[i], "BLACK");
			}
			for (int i = 0; i <= colorRow.length - 1; i++) // c
			{
				ColorDisplay.setPixelColor(colorRow[i], colorCol[i], "WHITE");
			}
		}
		if (beat > 10 && beat <= 25)
		{

			du(offset); // calling the method du+offset
		}

	}

	public static void dots(int c, String color)
	{
		for (int col = 0; col <= 19; col++)
		{
			for (int row = 0; row <= 9; row++)
			{
				if (row % 2 == 0 && col % 2 == 0)
				{
					if (c % 2 == 0) // even
					{
						ColorDisplay.setPixelColor(row, col, color);

					} else // odd
					{
						ColorDisplay.setPixelColor(row, col, "BLACK");
					}

				} else
				{
					if (c % 2 == 0) // odd
					{
						ColorDisplay.setPixelColor(row, col, "BLACK");

					} else // odd
					{
						ColorDisplay.setPixelColor(row, col, color);

					}
				}

			}

		}
	}

	public static void theEnd(int c, String color)
	{
		int[] BorderRow = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4 };
		int[] Bordercol = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, };
		int[] WordRow = { 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6,
				6, 6, 6, 6 };
		int[] WordCol = { 3, 4, 5, 7, 11, 13, 14, 3, 7, 10, 11, 13, 15, 3, 4, 5, 7, 10, 11, 13, 16, 3, 7, 9, 11, 13, 15,
				3, 4, 5, 7, 8, 11, 13, 14 };

		for (int i = 0; i < BorderRow.length; i++)
		{

			ColorDisplay.setPixelColor(5 - BorderRow[i] + 4, Bordercol[i], color); // left-top
			ColorDisplay.setPixelColor(BorderRow[i], 19 - Bordercol[i], color); // right-bottom
			if (c % 2 == 0) // even
			{
				ColorDisplay.setPixelColor(BorderRow[i], Bordercol[i], "BLACK"); // left-bottom
				ColorDisplay.setPixelColor(5 - BorderRow[i] + 4, 19 - Bordercol[i], "BLACK"); // right-top
			} else // odd
			{
				ColorDisplay.setPixelColor(BorderRow[i], Bordercol[i], "DARK_GRAY"); // left-bottom
				ColorDisplay.setPixelColor(5 - BorderRow[i] + 4, 19 - Bordercol[i], "DARK_GRAY"); // right-top
			}

		}
		for (int i = 0; i < WordCol.length; i++)
		{
			ColorDisplay.setPixelColor(WordRow[i], WordCol[i], "BLACK"); // "END"
			ColorDisplay.pause(200);

		}
	}

	public static void onBeat(int c) // main void
	{
		System.out.println("At beat : " + c);
//		theEnd(c, ColorDisplay.randomColor());
//		flappyBird(c, c % 20);
//		shades(c % 4,ColorDisplay.randomColor());
//		Balloon(c % 11, ColorDisplay.randomColor());
//		heartFilled(c);

//		bubble(c % 10); 
//		dots(c, ColorDisplay.randomColor());
//		rocket(c%10);
//		cactus(c);

		if (c >= 0 && c <= 10) // Appear 5 times ( odd and even)
		{
			pokeball(c % 2, ColorDisplay.randomColor());
		} else if (c > 10 && c <= 25) // 2 Way
		{
			bubble(c % 10, c, ColorDisplay.randomColor());
		} else if (c > 25 && c <= 44) // 1 Way (13 beats)
		{
			shades(c % 4, ColorDisplay.randomColor());
		} else if (c > 44 && c <= 69) // 2 Way
		{
			boggleEyed(c);
		} else if (c > 69 && c <= 77) // 1 Way
		{
			rocket(c % 10);
		} else if (c > 77 && c <= 95)
		{
			dots(c, ColorDisplay.randomColor());
		}

		else if (c > 95 && c <= 109)
		{
			rainbowHeart(c);
		} else if (c > 109 && c < 120)
		{
			Balloon(c % 11, ColorDisplay.randomColor());
		} else if (c >= 120 && c <= 135)
		{
			cactus(c, ColorDisplay.randomColor());
		}

		else if (c > 135 && c <= 147)
		{
			// pixel(c);
			flappyBird(c, ColorDisplay.randomColor());
		} else if (c > 147 && c < 150)
		{
			pixel(c);
		} else if (c >= 150 && c <= 160)
		{
			heartFilled(c);
		} else if (c > 160 && c <= 169)
		{
			shades(c % 4, ColorDisplay.randomColor());
		} else if (c > 169 && c <= 179)
		{
			rainbowHeart(c);
		} else if (c > 179 && c <= 189)
		{
			rocket(c % 10);
		} else if (c > 189 && c <= 210)
		{
			boggleEyed(c);
		} else if (c > 210 && c <= 219)
		{
			cactus(c, ColorDisplay.randomColor());
		} else if (c > 219 && c < 230) // 2 Way
		{
			bubble(c % 10, c, ColorDisplay.randomColor());
		} else if (c >= 230 && c <= 240) // 1 Way
		{
			Balloon(c % 11, ColorDisplay.randomColor());
		} else if (c > 240 && c < 250) // 1 Way
		{
			rocket(c % 10);
		} else if (c >= 250 && c < 286) // 2 Way
		{
			bubble(c % 10, c, ColorDisplay.randomColor());
		} else if (c >= 289 && c <= 285)
		{
			pixel(c);
		} else if (c > 285 && c <= 295)
		{
			heartFilled(c);
		} else if (c >= 296 && c < 300)
		{
			Balloon(c % 11, ColorDisplay.randomColor());
		} else if (c >= 300 && c <= 310)
		{
			boggleEyed(c);
		} else if (c > 310 && c <= 315)
		{
			dots(c, ColorDisplay.randomColor());
		} else if (c > 315 && c <= 335)
		{
			shades(c % 4, ColorDisplay.randomColor());
		} else if (c > 315 && c <= 325)
		{
			rainbowHeart(c);
		} else if (c > 325 && c <= 340)
		{
			flappyBird(c, ColorDisplay.randomColor());
		} else if (c > 340 && c <= 330)
		{
			Balloon(c % 11, ColorDisplay.randomColor());
		} else if (c > 330 && c < 340)
		{
			rocket(c % 10);
		} else if (c > 340 && c < 350)
		{
			bubble(c % 10, c, ColorDisplay.randomColor());

//		} else if (c > 350 && c < 362)
//		{
//			theEnd(c % 10, ColorDisplay.randomColor());
		}

	}
}

# Design file for Chess.java

## Chess Pieces
- Pawn
    - Moves Forward 1 space
    - Attacks Adjacently
- Rook
    - Moves horizontally and vertically as far as needed
    - Attacks horizontally  and vertically
- Bishop
    - Only moves adjacently
    - Only attacks adjacently
- Knight
    - Moves in an L shape pattern 1 space vertically 2 spaces horizontally
- King
    - Moves in any direction as far as needed.
- Queen
    - Moves in any direction 1 space

## Chess Board
- 8x8 board
    - Vertical 1-8
    - Horizontal a-h
    - 64 total squares
    - Checkered with half black and half white
- Hashmap 

## Moving Pieces
- each piece needs to know where it is and where it can move.

- pawns only need the place of movement to move.
- 
- Add x to the end of the notation (ex: nf3x)
- Add + to the end of notation for checks (ex: Bb5+)
- Add # to the end of notation for Checkmate (ex: Qh4#)


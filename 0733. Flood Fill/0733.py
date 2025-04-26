# time complexity: O(m x n)
# space complexity: O(m x n)
class Solution(object):
    # BFS ALGORITHM with a QUEUE
    def floodFill(self, image, start_row, start_col, new_color):
        """
        :type image: List[List[int]]
        :type sr: int
        :type sc: int
        :type color: int
        :rtype: List[List[int]]
        """
        original_color = image[start_row][start_col]
    
        # If the starting pixel already has the target color, nothing to do
        if original_color == new_color:
            return image

        rows, cols = len(image), len(image[0])
        # Queue holds pixels to process; start with the initial pixel
        queue = deque()
        queue.append((start_row, start_col))
        # Color the start pixel immediately
        image[start_row][start_col] = new_color

        # Directions for 4-connected neighbors: down, up, right, left
        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

        # Continue until no more pixels in queue
        while queue:
            current_row, current_col = queue.popleft()
            
            # Check all 4 neighbors
            for dr, dc in directions:
                neighbor_row = current_row + dr
                neighbor_col = current_col + dc
                
                # Check bounds
                if (0 <= neighbor_row < rows) and (0 <= neighbor_col < cols):
                    # If the neighbor has the original color, fill and enqueue it
                    if image[neighbor_row][neighbor_col] == original_color:
                        image[neighbor_row][neighbor_col] = new_color
                        queue.append((neighbor_row, neighbor_col))

        return image
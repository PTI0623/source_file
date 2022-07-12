import pyautogui
import pyperclip

a='mspaint'
pyperclip.copy(a)

pyautogui.hotkey('win','r')
pyautogui.hotkey('ctrl','v')
pyautogui.hotkey('enter')

pyautogui
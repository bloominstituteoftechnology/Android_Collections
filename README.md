# Android_Collections

This project will help you practice the skills and concepts you learned related to collections in Java. For this project you'll build an app with a text field for the user to enter a word. When they tap the button, the app will look for synonyms for the entered word, and will display them in a text view if any are found.

> A synonym is a word with the same meaning as another word. For example, `difficult` and `hard` are synonyms.

### Create an Android Studio Project

1. Create a new Android project
2. Name the project "Thesaurus"
3. Make sure you select Java as the development language

### Add UI Elements to activity_main.xml

1. Open the app's activity_main.xml file.
2. Add a edit text field to the main screen
3. Add a button to the main screen
4. Make the button's text "Show Synonyms"
5. Add a text view to the screen.
6. Add ids to all the elements

### Create Listeners

1. Create an onClickListener for the button in the MainActivity.java file.

### Write A Thesaurus Lookup Function

1. In MainActivity.java, create a variable that is a 2 dimensional String array where each element is an array of strings that are synonyms of the key word.
2. If you need help getting started, you can copy and paste the list found [here](https://github.com/LambdaSchool/Android_Collections/blob/master/Synonyms.java). Feel free to add any additional words that you'd like.
3. In this file, create a function called `synonyms()`. It should take a single string as an argument, and return a array of `String`s.
4. Write the `synonyms()` function. It should return an array of strings that are synonyms for the passed in string, or null if there are no synonyms.
5. Use a for loop to step through the top level array and look for the string in the first element of each element array.

### Implement The User Interface

1. In the listener for the "Show Synonyms" button, get the string entered in the text field, look up synonyms for it using your `synonyms()` function, and if any synonyms are found, display them in the text view.
2. Be sure to combine the strings in the array into a single string to be displayed in the text view.

### Build, Run, and Test Your App

1. Build and run your app using your preferred testing environment.
2. Enter various words, including those you know are in your synonyms directory, and others that aren't into the text field and make sure the synonym listing works.

### Bonus

If you finish and want another challenge try making it so that if a any word in the element array is equivalent to the value entered, that all its sibling synonyms are found and returned.

For example, if your synonyms array were:

```
String[][] synonyms = {{"learn", "determine", "master", "study", "get", "grasp"}};
```

and the user entered `"study"`, the app should output "determine", "master", "get", "grasp", **and** "learn".

import React from "react";
import { StyleSheet, Text, View } from "react-native";

export default class App extends React.Component {
  componentDidMount() {
    fetch("https://www.google.com")
      .then(response => alert(JSON.stringify(response)))
      .catch(error => {
        alert(JSON.stringify(error));
      });
  }

  render() {
    return (
      <View style={styles.container}>
        <Text>Open up App.js to start working on your app!</Text>
        <Text>Changes you make will automatically reload.</Text>
        <Text>Shake your phone to open the developer menu.</Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center"
  }
});

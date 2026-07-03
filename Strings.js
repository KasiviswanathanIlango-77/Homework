function analyzeSentence(sentence)
{
    return{
        totalCharacters:sentence.length,
        totalWords:sentence.trim().split(/\s+/).length,
        lowercaseSentence:sentence.toLowerCase()
    };
}


let input = "Hello welcome to the Coding World . I am a Software developer.";
let result=analyzeSentence(input);
console.log(result);
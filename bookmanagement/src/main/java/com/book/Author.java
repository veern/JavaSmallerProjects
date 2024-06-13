package com.book;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Author {
    
    private String firstName;
    private String lastName;

    public Author(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName != null) ? firstName.hashCode() : 0);
        result = prime * result + ((lastName != null) ? lastName.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Author otherAuthor = (Author) obj;
        return Objects.equals(firstName, otherAuthor.firstName) &&
            Objects.equals(lastName, otherAuthor.lastName);
    }
}

import {getImageUrl} from './utils.js';

function Avatar({person, size=100}) {

    return (
        <img
            className="avatar"
            src={getImageUrl(person)}
            alt={person.name}
            width={size}
            height={size}
        />
    );
}

export default Avatar;